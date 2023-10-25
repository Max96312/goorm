let instance;

class Counter {
    constructor(){
        if(instance){
            throw new Error('하나의 인스턴스만 생성할 수 있습니다.');
        }
        this.counter = 0;
        instance = this;
    }

    getCount(){
        return this.counter;
    }

    increment(){
        return this.counter++;
    }

    decrement(){
        return this.counter--;
    }
}

const stingletonCounterA = new Counter();

const CounterB = new Counter();

stingletonCounterA.increment();
stingletonCounterA.increment();

console.log(stingletonCounterA.getCount());