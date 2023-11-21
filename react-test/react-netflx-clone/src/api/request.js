const requests = {
    fetchNowPlaying: `movie/now_playing`,
    fetchNetflixOriginals: `dicover/tv?with_networks=213`,
    fetchTrending: `/trending/all/week`,
    fetchToRated: `/movie/top_rated`,
    fetchActionMovies: `/dicover/movie?with_genres=28`,
    fetchComedyMovies: `/discover/movie?with_genres=35`,
    fetchHorrorMoveis: `/discover/movie?with_genres=27`,
    fetchRomanceMovies: `/discover/movie?with_genres=10749`,
    fetchDocumentaries: `/discover/movie?with_genres=99`,
}

export default requests;