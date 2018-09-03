<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>앱 등록 완료</title>
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/grids-responsive-old-ie-min.css">
    <![endif]-->
    <!--[if gt IE 8]><!-->
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/grids-responsive-min.css">
    <!--<![endif]-->
    <link rel="stylesheet" href="/css/custom.css">
    <style>
        .pad-1 {
            padding: 1em;
        }
    </style>
</head>
<body>
<div class="pure-g">
  <div class="pure-u-1">
    <h1>[${consumer.name}] 애플리케이션이 등록되었습니다.</h1>
  </div>
</div>
<hr/>
<div class="pure-g">
  <div class="pure-u-1 pad-1">
    <span class="pure-button pure-button-primary button-large">Consumer Key: ${consumer.consumerKey}</span>
  </div>
  <div class="pure-u-1 pad-1">
    <span class="pure-button button-error button-large">Consumer Secret: ${consumer.consumerSecret}</span>
  </div>
  <div class="pure-u-1 pad-1">
    <span class="pure-button button-secondary button-large">Callback URL: ${consumer.callbackUrl}</span>
  </div>
</div>

</body>
</html>