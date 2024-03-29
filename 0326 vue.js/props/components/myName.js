// myName.js

let ChildComponent = {
    template : `
    <div>
    <p> 내 이름은 {{ name }} 입니다. </p>
    <p> 변경될 이름</p>
    <input type= "text"
           v-model.lazy = "updateName"
           @keyup.enter = "updateMyName()"> 
    </div>
    `,
    props : ['name'],   //props: ['attr']
    data(){
        return{
            name: '주완',
            updateName : '',
           
        }
    },
    methods: {
        updateMyName(){
            this.$emit('update-name' , this.updateName, //$emit 정식 이벤트는 아닌데 값이 변했다고 전달하는 역할  --> v-on:custom-event
                                       '업데이트 진행'); // 원하는 만큼 props에 선언가능
       
     }
    }
}
//-- name = childComponent의 props : ['name']
export default {
    template :`
    <div>
        <ChildComponent 
            v-bind:name="first"
            v-on:update-name="getName"/> <!-- 메소드 때문에 괄호를 쓰지 않음 -->
        <ChildComponent v-bind:name="second"/>
    </div>
    `,
    data(){
        return{
            first : 'Hong',
            second : 'Kang'
        }
    },
    components : {
        ChildComponent
    },
    methods: {
        getName(data, msg){
            console.log(data, msg);
            this.first = data;
        }
    },
    
}