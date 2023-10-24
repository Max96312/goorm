// const audio = {
//     title: 'a',
//     play() {
//         console.log('play this', this);
//     }
// }

// audio.play();

// audio.stop = function (){
//     console.log('stop this', this);
// }

// audio.stop();

// function playAudio(){
//     console.log(this);
// }

// playAudio();

// function Audio(title){
//     this.thitle = title;
//     console.log(this);
// }
// const audio = new Audio();

// const audio = {
//     title: 'audio',
//     categories: ['music', 'video'],
//     diplayCategories() {
//         this.categories.forEach(function(category) {
//             console.log(`title: ${this.title}, category: ${category}`);
//         }, this)
//     }
// }

// audio.diplayCategories();


// Lexical this
const audio = {
    title: 'audio',
    categories: ['music', 'video'],
    diplayCategories() {    
        this.categories.forEach((category) => {
           console.log(this);
        })
    }
}

audio.diplayCategories();