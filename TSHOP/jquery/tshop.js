$(document).ready(function () {
    $(window).scroll(function () {
        if ($(this).scrollTop() > $("#navi-2").height()) {
            $("#navi-2").addClass("navbar-fixed-top");
        } else {
            $("#navi-2").removeClass("navbar-fixed-top");
        }
    });

    $("#cate").click(function () {
        $("#s1").toggle(1000);
    });

    $("#price").click(function () {
        $("#show-price").slideToggle();
    });

    $("#brand").click(function () {
        $("#show-brand").slideToggle();
    });

    $("#woman-c").click(function () {
        $("#show1").slideToggle();
    });

    $("#men-c").click(function () {
        $("#show2").slideToggle();
        $("#show1").slideUp();
    });

    $("#baby-k").click(function () {
        $("#show3").slideToggle();
        $("#show2").slideUp();
        $("#show1").slideUp();
    });

    $("#home-k").click(function () {
        $("#show4").slideToggle();
        $("#show3").slideUp();
        $("#show2").slideUp();
        $("#show1").slideUp();
    });

    $("#more-s").click(function () {
        $("#show5").slideToggle();
        $("#show4").slideUp();
        $("#show3").slideUp();
        $("#show2").slideUp();
        $("#show1").slideUp();
    });

    $("#off-z").click(function () {
        $("#show6").slideToggle();
        $("#show5").slideUp();5
        $("#show4").slideUp();5
        $("#show3").slideUp();5
        $("#show2").slideUp();5
        $("#show1").slideUp();5
    });
});