document.getElementById("formKontak").addEventListener("submit", function (e) {
  e.preventDefault();

  document.getElementById("hasilNama").textContent =
    document.getElementById("nama").value || "-";
  document.getElementById("hasilTelepon").textContent =
    document.getElementById("telp").value || "-";
  document.getElementById("hasilSubjek").textContent =
    document.getElementById("subjek").value || "-";
  document.getElementById("hasilPesan").textContent =
    document.getElementById("pesan").value || "-";

  document.getElementById("formArea").style.display = "none";
  document.getElementById("hasil").style.display = "block";
});
