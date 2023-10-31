const APIURL = "https://api.github.com/users/";
const main = document.querySelector("#main");

const getUser = async (username) => {
  const response = await fetch(APIURL + username);
  const data = await response.json();
  const card = `
    <div class="card">
      <div>
        <img class="avatar" src="${data.avatar_url}" alt="#">
      </div>
      <div class="user-info">
        <h2>${data.name}</h2>
        <p>${data.bio}</p>

        <ul class="info">
          <li>${data.followers}<strong>Followers</strong></li>
          <li>${data.following}<strong>Following</strong></li>
          <li>${data.public_repos}<strong>Public Repos</strong></li>
        </ul>
        
        <div id="repos">

        </div>
    </div>
    `

    main.innerHTML = card;
    getRepos(username);
};

const getRepos = async(username) => {
  const repos = document.querySelector("#repos");
  const reponse = await fetch(APIURL + username + "/repos");
  const data = await reponse.json();
  data.forEach(
    (item) => {
      console.log(item);
      const elem = document.createElement("a");
      elem.classList.add("repo");
      elem.href = item.html_url;
      elem.innerHTML = item.name;
      elem.target = "_blank";
      repos.appendChild(elem);
    }
  )
  console.log(data);
}

const formSubmit = () => {
  const searchBox = document.querySelector("#search");
  if (searchBox.value != "") {
    getUser(searchBox.value);
  }
  return false;
}

getUser("max96312");