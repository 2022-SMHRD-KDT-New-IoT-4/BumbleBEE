<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/style.css">
    <title>Document</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/main.css" />
    <noscript>
        <link rel="stylesheet" href="./assets/css/noscript.css" />
    </noscript>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form action="Boardwrite.do" method="post">
    <article id="boardwrite" class="panel">
            <article id="boardwrite" class="panel">
            <div class="form_box">
                <h3 class="text-warning text-bold">게시글 작성</h3>
                <input class="input_field" name = "title" type="text" placeholder="제목을 입력해주세요." ><br>
                <textarea class="textarea_field" name = "content" placeholder="내용을 입력해주세요." rows="20" cols="12"></textarea><br>
                <div class="d-flex justify-content-center">
                	<button type="button" onclick="location.href = 'Boardmain.do'" class="btn btn-warning">돌아가기</button>
                	<button type="submit" class="btn btn-warning">글쓰기</button>
                </div>
                
            </div>
            
            </article>
    </article>
</form>
</body>
</html>