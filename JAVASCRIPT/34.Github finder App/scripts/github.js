class GitHub {
    async getUser(user) {
      const profileResponse = await fetch(
        `https://api.github.com/users/${user}`
      );
  
      const reposResponse = await fetch(
        `https://api.github.com/users/${user}/repos`
        );
  
      const profile = await profileResponse.json();
      const repos = await reposResponse.json();

      return {
        profile,
        repos
      };
    }
  }