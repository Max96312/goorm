function func() {
    if (true){
        var a = 'a';
        console.log(a);
    }
    console.log(a);
}
// console.log(a);
func();

function func2() {
    if (true){
        let a = 'a';
        console.log(a);
    }
    // console.log(a);
}

func2();