$(document).ready(function () {
    $('input[name="username"],input[name="pass"]').focus(function () {
        $(this).prev().animate({
            'opacity': '1'
        }, 200);
    });
    $('input[name="username"],input[name="pass"]').blur(function () {
        $(this).prev().animate({
            'opacity': '.5'
        }, 200);
    });
    $('input[name="username"],input[name="pass"]').keyup(function () {
        if (!$(this).val() == '') {
            $(this).next().animate({
                'opacity': '1',
                'right': '30'
            }, 200);
        } else {
            $(this).next().animate({
                'opacity': '0',
                'right': '20'
            }, 200);
        }
    });
    
    $('.login-signup a').click(function () {
        $('form').animate({ height: "toggle", opacity: "toggle" }, "slow")});
});