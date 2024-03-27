//input.js
let template = `
    
    <!-- 실제로 등록되지 않는 태그 , 
    화면의 출력되는 대상이 아니라 인식을 못함-->
   <div>          
        <!-- v-model= 밸류값 vue 가 가지고 
        있는 프로퍼티가 업데이트가 됨, 양방향 데이터 바인딩 -->
        <!-- document.queryselector('input[type="text"]'.value  -->
        <input type="text" v-model="myName"><br>
        <p> 나는 {{ myName }} 입니다.<br><br><br><br>

        <!-- input 태그안의 type:"number" 이면 v-model.number과 동일 효과--> 
        <input v-model.number="myNum"><br>
        <p> 계산결과 : {{myNum + 1000}} </p><br><br><br>

        <textarea v-model.lazy="myTextArea" /> 
        <div v-text="myTextArea"/></p><br><br><br>


        <!-- 선택한 옵션의 인덱스 값을 쥐고 있음 -->
        <!-- multiple이 붙으면 동일한 값인데도 불구하고 값이 배열로 됨-->
        <select v-model="mySelect" multiple>
            <option>선택1</option>
            <option>선택2</option>
            <option>선택3</option>
        </select>
        <br>

        <!--    =====================       -->
        <!-- v-model 디렉티브 : checked 속성 -->
        <!-- 1.checkbox 하나만 -->
        <input type ="checkbox" v-model="myCheck1" true-value="확인완료" false-value="미확인"> 확인여부 <br>
        <p> {{ myCheck1 }} </p> <br><br><br>


        <!-- 고정값을 가지고 오기 때문에 바인드 디렉티브 x -->
        <!-- 2.checkbox 여러개 -->
        <input type="checkbox" v-model="myCheck2" value="독서"> 
        독서
        <input type="checkbox" v-model="myCheck2" value="운동">
        운동
        <input type="checkbox" v-model="myCheck2" value="여행">
        여행
        <p> 취미 : {{myCheck2}} </p> <br><br><br>

        <!-- 예제 -->
        <input type = "checkbox" v-model="isAgreed" > 약관에 동의합니다. <br>
        <button type = "button" v-bind:disabled="!isAgreed"> 회원가입 </button> <br><br><br>

        <!--    =====================     -->
        <!-- v-model 디렉티브 : radio 속성 -->
        <input type="radio" v-model="myGender" value="남자">남자
        <input type="radio" v-model="myGender" value="여자">여자 <br>
        <p> 성별 : {{ myGender }} </p>

        <!--    item : 실제 데이터, 반복되면서 하나씩 읽어드린 데이터를 담음  
                index : items의 인덱스(배열의 현재 index 값) 
                in items :  컴포넌트가 가지고 있는 프로퍼티 데이터 배열 -->
        

   </div>
`;

export default {
    template,
    data(){
        return{
            myName : 'v-model="밸류값" 의 초깃값 ',
            myNum : 'v-model.number="숫자" 의 초깃값',
            myTextArea : 'v-text="myTextArea" 의 초깃값',
            mySelect : 'select v-model="mySelect"',
            myCheck1 : '',
            myCheck2 : [],
            isAgreed : false,
            myGender : '',
        }
    }
}