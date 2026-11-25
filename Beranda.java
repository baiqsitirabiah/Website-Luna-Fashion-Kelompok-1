document.getElementById("judul-hero").textContent = "TAMPIL ANGGUN SETIAP HARI";
document.getElementById("deskripsi-hero").textContent =
    "Koleksi fashion terbaru untuk kamu tampil cantik dan percaya diri setiap hari.";

const daftarProduk = [
    { nama: "Kemeja Oversize Cream", harga: 85000 },
    { nama: "Hijab Voal Navy", harga: 45000 },
    { nama: "Rok Plisket Premium", harga: 75000 },
    { nama: "Sepatu Soft Pink Putih", harga: 95000 }
];

function hitungTotal(harga, jumlah) {
    const total = harga * jumlah;
    return total;
}

const totalKemeja = hitungTotal(daftarProduk[0].harga, 2);
const totalHijab = hitungTotal(daftarProduk[1].harga, 3);

console.log("Total " + daftarProduk[0].nama + " (x2): Rp" + totalKemeja);
console.log("Total " + daftarProduk[1].nama + " (x3): Rp" + totalHijab);
