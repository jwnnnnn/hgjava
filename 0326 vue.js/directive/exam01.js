//exam01.js
let template= `
    <div>
    <p> 자기소개 </p>
    
    이름 : <input type ="text" v-model.lazy="name" > <br>
    <p>좋아하는 색은 ? (택1)</p>
    <input type= "radio" v-model= "color" value="red" >
    빨강
    <input type= "radio" v-model= "color" value="green">
    녹색
    <input type= "radio" v-model= "color" value="blue" >
    파란색
    <input type= "radio" v-model= "color" value="yellow">
    노란색
    <input type= "radio" v-model= "color" value="gray">
    회색

    <p>내 이름은 {{name}} 이고, 좋아하는 색은 {{color}} 입니다.</p>
    <!-- disabled 자체가 boolean 타입 -->
    <select v-model="mySelectorColor" 
            v-bind:disabled="name.length == 0">
     <option value ="red"> 빨강 </option>
     <option value ="green"> 녹색 </option>
     <option value ="blue"> 파랑색 </option>
     <option value ="yellow"> 노란색 </option>
     <option value ="gray"> 회색 </option>
    </select>

    <p>내 이름은 {{name}} 이고, 좋아하는 색은 {{mySelectorColor}} 입니다.</p>
    </div>


    
`;


export default {
    template,
    data(){
        return{
            name : '',
            color : '',
            mySelectorColor : '',
           
        }
    }
}