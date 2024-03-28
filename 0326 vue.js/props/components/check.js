//check.js

let ChildComponent = {
    template : `
    <div>
        <p> 숫자 : {{ num }} </p>
        <p> 문자열 : {{ str }} </p>
        <p> 짝수?  : {{ even }} </p>
        <p> 객체 :  {{ obj }} </p>
    </div>
    `,
    props : {
        num : {
            type : Number, // [Number, String] 배열로 경우에 따라 복수로 가능 
            required : true
        },
        str : {
            type: String,
            default : 'Hello!' // 기본값
        },
        even : {
            validator(value){  // 유효성검사 . 넘어온 값이 맞는지 아닌지 확인
                return(value%2 == 0);
            }
        },
        //obj : Object,
        obj : { //이런식으로 사용할 경우엔 함수를 사용해야함.
            type : Object,
            default : ()=> {
                return {
                    name : 'hong',
                    age :    20
                }
            }
        }
    }
};

export default {
    template : `
    <div>
    <ChildComponent 
        v-bind:num = "myNumber"
        v-bind:str = "sendMsg"
        :even = "myNumber"
        :obj = "newObj"

    />
    </div>
    `,
    data(){
        return{
            myNumber : 55,
            sendMsg  : 'Hello, World!',
            newObj : null
        }
    },
    components: {
        ChildComponent
    }


}