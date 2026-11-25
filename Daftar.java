
if (document.getElementById("formDaftar")) {

    document.getElementById("formDaftar").addEventListener("submit", function(event) {

        event.preventDefault();

        var nama = document.getElementById("nama").value;
        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;
        var konfirmasi = document.getElementById("konfirmasi").value;

        if (password !== konfirmasi) {
            alert("Konfirmasi kata sandi tidak sesuai!");
            return;
        }

        var daftar = JSON.parse(localStorage.getItem("dataDaftar")) || [];

        daftar.push({
            nama: nama,
            email: email
        });

        localStorage.setItem("dataDaftar", JSON.stringify(daftar));
        window.location.href = "data_daftar.html";
    });
}


if (document.getElementById("daftarBody")) {
    var daftar = JSON.parse(localStorage.getItem("dataDaftar")) || [];
    var tabel = document.getElementById("daftarBody");

    for (var i = 0; i < daftar.length; i++) {
        var baris = document.createElement("tr");
        var nomor = document.createElement("td");
        nomor.textContent = i + 1;
        var nama = document.createElement("td");
        nama.textContent = daftar[i].nama;
        var email = document.createElement("td");
        email.textContent = daftar[i].email;

        baris.appendChild(nomor);
        baris.appendChild(nama);
        baris.appendChild(email);

        tabel.appendChild(baris);
    }
}
