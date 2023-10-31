const APIURL = 'https://api.github.com/users/';

class GitHub {
  
    async getUser(user) {
      const profileResponse = await fetch(APIURL + user);
  
      const reposResponse = await fetch(APIURL + user + "/repos");
  
      const profile = await profileResponse.json();
      const repos = await reposResponse.json();

      return {
        profile,
        repos
      };
    }
  }