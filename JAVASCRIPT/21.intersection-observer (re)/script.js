const count = 20;
let itemIndex = 0;

const observer = new IntersectionObserver(entries => {
    console.log('entries', entries);
})

observer.observe(document.querySelector('.end'))
