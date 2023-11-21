import axios from "axios";

const instance = axios.create({
    baseURL: "https://api.themoviedb.org/3",
    params:{
        api_key: "1983ebe37617bbeac0489ac594c34f91",
        language: "ko-KR",
    },
});

export default instance;