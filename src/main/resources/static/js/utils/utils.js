
    window.onload=(function () {
    console.log("why you so diao")
    $.get("/IPStorage", "", function (text) {
    //显示在info中
  //  $("#info").text(text);

});
    //navigator.geolocation.getCurrentPosition()
    var geolocation = navigator.geolocation;
    console.log(geolocation)
})
