<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>앱 등록</title>
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/grids-responsive-old-ie-min.css">
    <![endif]-->
    <!--[if gt IE 8]><!-->
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/grids-responsive-min.css">
    <!--<![endif]-->
    <style>
        .pad-1 {
            padding: 1em;
        }
    </style>
</head>
<body onload="initFocus()">
<div class="pure-g">
    <form class="pure-form pure-form-stacked" action="/consumer/register" method="post">
        <div class="pure-u-1">
            <div class="pad-1">
                <legend>등록할 앱의 정보를 입력해주세요</legend>
            </div>
            <div class="pad-1">
                <label for="app-name">앱 이름</label>
                <input type="text" id="name" name="name" size="50" placeholder="50자 이내로 써 주세요">
            </div>
            <div class="pad-1">
                <label for="app-desc">앱 설명</label>
                <textarea id="app-desc" name="description" cols="50" rows="5" placeholder="140자 이내로 써 주세요"></textarea>
            </div>
            <div class="pad-1">
                <label for="app-callback">콜백 URL</label>
                <input type="text" id="app-callback" name="callbackUrl" size="50" placeholder="50자 이내로 써 주세요"></textarea>
            </div>
            <div class="pad-1">
                <button type="submit" class="pure-button pure-button-primary">앱 등록</button>
            </div>
        </div>
    </form>
</div>
<script>
    function initFocus() {
        document.getElementById('app-name').focus();
    }
</script>
</body>
</html>