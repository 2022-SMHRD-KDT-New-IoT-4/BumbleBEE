/*
	Astral by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
*/

(function ($) {

	var $window = $(window),
		$body = $('body'),
		$wrapper = $('#wrapper'),
		$main = $('#main'),
		$panels = $main.children('.panel'),
		$nav = $('#nav'), $nav_links = $nav.children('a');

	// Breakpoints.
	breakpoints({
		xlarge: ['1281px', '1680px'],
		large: ['981px', '1280px'],
		medium: ['737px', '980px'],
		small: ['361px', '736px'],
		xsmall: [null, '360px']
	});

	// Play initial animations on page load.
	$window.on('load', function () {
		window.setTimeout(function () {
			$body.removeClass('is-preload');
		}, 100);
	});

	// Nav.
	$nav_links
		.on('click', function (event) {

			var href = $(this).attr('href');

			// Not a panel link? Bail.
			if (href.charAt(0) != '#'
				|| $panels.filter(href).length == 0)
				return;

			// Prevent default.
			event.preventDefault();
			event.stopPropagation();

			// Change panels.
			if (window.location.hash != href)
				window.location.hash = href;

		});

	// Panels.

	// Initialize.
	(function () {

		var $panel, $link;

		// Get panel, link.
		if (window.location.hash) {

			$panel = $panels.filter(window.location.hash);
			$link = $nav_links.filter('[href="' + window.location.hash + '"]');

		}

		// No panel/link? Default to first.
		if (!$panel
			|| $panel.length == 0) {

			$panel = $panels.first();
			$link = $nav_links.first();

		}

		// Deactivate all panels except this one.
		$panels.not($panel)
			.addClass('inactive')
			.hide();

		// Activate link.
		$link
			.addClass('active');

		// Reset scroll.
		$window.scrollTop(0);

	})();

	// Hashchange event.
	$window.on('hashchange', function (event) {

		var $panel, $link;

		// Get panel, link.
		if (window.location.hash) {

			$panel = $panels.filter(window.location.hash);
			$link = $nav_links.filter('[href="' + window.location.hash + '"]');

			// No target panel? Bail.
			if ($panel.length == 0)
				return;

		}

		// No panel/link? Default to first.
		else {

			$panel = $panels.first();
			$link = $nav_links.first();

		}

		// Deactivate all panels.
		$panels.addClass('inactive');

		// Deactivate all links.
		$nav_links.removeClass('active');

		// Activate target link.
		$link.addClass('active');

		// Set max/min height.
		$main
			.css('max-height', $main.height() + 'px')
			.css('min-height', $main.height() + 'px');

		// Delay.
		setTimeout(function () {

			// Hide all panels.
			$panels.hide();

			// Show target panel.
			$panel.show();

			// Set new max/min height.
			$main
				.css('max-height', $panel.outerHeight() + 'px')
				.css('min-height', $panel.outerHeight() + 'px');

			// Reset scroll.
			$window.scrollTop(0);

			// Delay.
			window.setTimeout(function () {

				// Activate target panel.
				$panel.removeClass('inactive');

				// Clear max/min height.
				$main
					.css('max-height', '')
					.css('min-height', '');

				// IE: Refresh.
				$window.triggerHandler('--refresh');

				// Unlock.
				locked = false;

			}, (breakpoints.active('small') ? 0 : 500));

		}, 250);

	});

	// IE: Fixes.
	if (browser.name == 'ie') {

		// Fix min-height/flexbox.
		$window.on('--refresh', function () {

			$wrapper.css('height', 'auto');

			window.setTimeout(function () {

				var h = $wrapper.height(),
					wh = $window.height();

				if (h < wh)
					$wrapper.css('height', '100vh');

			}, 0);

		});

		$window.on('resize load', function () {
			$window.triggerHandler('--refresh');
		});

		// Fix intro pic.
		$('.panel.intro').each(function () {

			var $pic = $(this).children('.pic'),
				$img = $pic.children('img');

			$pic
				.css('background-image', 'url(' + $img.attr('src') + ')')
				.css('background-size', 'cover')
				.css('background-position', 'center');

			$img
				.css('visibility', 'hidden');

		});





	}



	$(document).ready(function () {
		let weatherIcon = {
			'01': 'fas fa-sun',
			'02': 'fas fa-cloud-sun',
			'03': 'fas fa-cloud',
			'04': 'fas fa-cloud-meatball',
			'09': 'fas fa-cloud-sun-rain',
			'10': 'fas fa-cloud-showers-heavy',
			'11': 'fas fa-poo-storm',
			'13': 'far fa-snowflake',
			'50': 'fas fa-smog'
		};

		$.ajax({
			url: 'http://api.openweathermap.org/data/2.5/weather?q=Gwangju&APPID=2ac15d9cd6dcfb20a2c3689107d75f0c&units=metric',

			dataType: 'json',
			type: 'GET',
			success: function (data) {
				var $Icon = (data.weather[0].icon).substr(0, 2);
				var $Temp = Math.floor(data.main.temp) + 'º';
				var $city = data.name;

				$('.CurrIcon').append('<i class="' + weatherIcon[$Icon] + '"></i>');
				$('.CurrTemp').prepend($Temp);
				$('.City').append($city);
			}
		})
	});


})(jQuery);




function GetInfo() {

	var newName = document.getElementById("cityInput");
	var cityName = document.getElementById("cityName");

	cityName.innerHTML = "--" + newName.value + "--";

	fetch('https://api.openweathermap.org/data/2.5/forecast?q=' + newName.value + '&appid=32ba0bfed592484379e51106cef3f204')
		.then(response => response.json())
		.then(data => {

			//Getting the min and max values for each day
			for (i = 0; i < 5; i++) {
				document.getElementById("day" + (i + 1) + "Min").innerHTML = "Min: " + Number(data.list[i].main.temp_min - 273.15).toFixed(1) + "°";

				//Number(1.3450001).toFixed(2); // 1.35
			}

			for (i = 0; i < 5; i++) {
				document.getElementById("day" + (i + 1) + "Max").innerHTML = "Max: " + Number(data.list[i].main.temp_max - 273.15).toFixed(2) + "°";
			}

			for (i = 0; i < 5; i++) {
				document.getElementById("day" + (i + 1) + "humidity").innerHTML = "습도:" + Number(data.list[i].main.humidity) + '%';
			}



			//Getting Weather Icons
			for (i = 0; i < 5; i++) {
				document.getElementById("img" + (i + 1)).src = "http://openweathermap.org/img/wn/" +
					data.list[i].weather[0].icon
					+ ".png";
			}
			//------------------------------------------------------------
			console.log(data)


		})

		.catch(err => alert("Something Went Wrong: Try Checking Your Internet Coneciton"))
}

function DefaultScreen() {
	document.getElementById("cityInput").defaultValue = "Gwangju";
	GetInfo();
}


//Getting and displaying the text for the upcoming five days of the week
var d = new Date();
var weekday = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",];

//Function to get the correct integer for the index of the days array
function CheckDay(day) {
	if (day + d.getDay() > 6) {
		return day + d.getDay() - 7;
	}
	else {
		return day + d.getDay();
	}
}

for (i = 0; i < 5; i++) {
	document.getElementById("day" + (i + 1)).innerHTML = weekday[CheckDay(i)];
}



