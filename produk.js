function tutupSemua() {
  var semua = document.querySelectorAll(".model");
  for (var i = 0; i < semua.length; i++) {
    semua[i].style.display = "none";
  }
  document.getElementById("produk").style.display = "block";
}

function tampilkan(id) {
  tutupSemua();
  document.getElementById("produk").style.display = "none";
  document.getElementById(id).style.display = "block";
  window.scrollTo(0, 0);
}
