// function fetchData(){
//     return new Promise((resolve, reject) => {
//         const success = true;

//         if(success){
//             resolve('Success');
//         } else{
//             reject('Error');
//         }
//     })
// }

// fetchData()
//    .then((response) => {
//         console.log(response);
//    })
//    .catch((error) => {
//         console.log(error);
//    })

// fetch('http://jsonplaceholder.typicode.com/todos/1')
//     .then(response1 => response1.json())
//     .then(json1 => console.log(json1))
//     .then(() => fetch('http://jsonplaceholder.typicode.com/todos/2'))
//     .then(response2 => response2.json())
//     .then(json2 => console.log(json2))
//     .catch((error) => {
//         console.log(error)
//     })
//     .finally(() => {
//         console.log('finally')
//     })

async function makeRequests() {
    try{
        const response1 = await fetch('http://jsonplaceholder.typicode.com/todos/1');
        const jsonResponse1 = await response1.json();
        console.log(jsonResponse1);
    } catch (error) {
        console.error(error);
    } finally {
        console.log('finally');
    }
}

makeRequests();