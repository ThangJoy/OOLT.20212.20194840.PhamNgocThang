<!doctype html>
<html class="no-js" lang="en">


<!-- Mirrored from demo.hasthemes.com/rusu-preview/rusu/index-2.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 23 Sep 2019 16:36:34 GMT -->
<head>
    <base href="{{asset('')}}">
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    @yield('title')
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="asset/assets/img/favicon.ico">
    
    <!-- CSS 
    ========================= -->

    <!-- Plugins CSS -->
    <link rel="stylesheet" href="asset/assets/css/plugins.css">
    
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="asset/assets/css/style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>

<body>
   
    @include('viewer.layout.header')
    
    @yield('content')
    @include('viewer.layout.footer')

    
    

<!-- JS
============================================ -->

<!-- Plugins JS -->
<script src="asset/assets/js/plugins.js"></script>

<!-- Main JS -->
<script src="asset/assets/js/main.js"></script>



</body>


<!-- Mirrored from demo.hasthemes.com/rusu-preview/rusu/index-2.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 23 Sep 2019 16:36:39 GMT -->
</html>