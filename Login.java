if (document.getElementById("formLogin")) {
    document.getElementById("formLogin").addEventListener("submit", function(event) {

        event.preventDefault();

        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;

        sessionStorage.setItem("emailLogin", email);
        sessionStorage.setItem("passwordLogin", password);

        window.location.href = "data_login.html";

    });
}

if (document.getElementById("password") &&
    document.getElementById("email") &&
    !document.getElementById("formLogin")) {

    document.getElementById("email").textContent =
        sessionStorage.getItem("emailLogin");

    document.getElementById("password").textContent =
        "[Disembunyikan]";
}
