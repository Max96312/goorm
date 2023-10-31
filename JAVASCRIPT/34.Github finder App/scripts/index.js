const github = new GitHub();
const ui = new UI();

const searchUser = document.querySelector("#search-user");

searchUser.addEventListener("keypress", (e) => {
  const userText = e.target.value;

  if(e.key === "Enter") {
    if (userText !== "") {
        github.getUser(userText)
        .then((data) => {
          console.log(data);
          if (data.profile.message === "Not Found") {
            ui.showAlert("User not found", "alert alert-danger");
          } else {
            ui.showProfile(data.profile);
            ui.showRepos(data.repos);
            ui.showContributors(data.contributors);
          }
        });
      } else {
        ui.clearProfile();
      }
    }
});