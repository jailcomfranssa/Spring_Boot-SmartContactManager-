console.log("Script carregado");

let currentTheme = getTheme();
document.addEventListener('DOMContentLoaded', () =>{
    changeTheme()
})


function changeTheme() {
    changePageTheme(currentTheme, currentTheme);

    const changeThemeButton = document.querySelector('#theme_change_button');
    changeThemeButton.querySelector("span").textContent = currentTheme === "light" ? "Dark" : "Light";

    changeThemeButton.addEventListener("click", (event) => {
        const oldTheme = currentTheme;

        if (currentTheme === "dark") {
            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }

        changePageTheme(currentTheme, oldTheme);
    });
}

function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}

function changePageTheme(theme, oldTheme) {
    setTheme(theme);
    const htmlElement = document.querySelector('html');
    htmlElement.classList.remove(oldTheme);
    htmlElement.classList.add(theme);

    document.querySelector('#theme_change_button').querySelector("span").textContent =
        theme === "light" ? "Dark" : "Light";
}










