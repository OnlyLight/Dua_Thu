$(document).ready(function () {
    $(window).scroll(function () {
        if ($(this).scrollTop() > $("#navi").height()) {
            $("#navi").addClass('fixed-navi');
        } else {
            $("#navi").removeClass('fixed-navi');
        }
    });
});