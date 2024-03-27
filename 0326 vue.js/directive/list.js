// list.js

let template  = `
    <!-- 프로퍼티 없이 v-for(반복하고자 하는 태그에 사용) -->
    <ul>
        <!-- v-for li태그에 반복 -->
        <!-- num = 임시변수 for 디렉터리를 위해 li태그를 벗어날 수 없음 -->
        <li v-for="num in 5" v-bind:key="num"> {{num}} </li>
    </ul>  <br><br><br>

    <!-- 단일값 배열을 활용 , 인덱스 사용 O-->
    <ul>
        <li>인덱스 사용 O </li>
        <li v-for="(value, key) in myArray "> idx {{인덱스}}   :  data  {{값}}   </li>
    </ul> <br>


    <!-- 인덱스 사용 X-->
    <ul>
        <li>인덱스 사용 X </li>
        <li v-for="값 in myArray "> data  {{값}} </li>
    </ul>


    <!-- 바인드 디렉티브 연결 -->
    <ul>
        <li>인덱스 사용 O </li>
        <li v-for="(값, 인덱스) in myArray" : key="인덱스" > idx {{인덱스}}   :  data  {{값}}  </li>
    </ul>
    <!-- key => 고유값 , vue가 특정 대상을 식별  -->
    <!-- v-for => key , Component => key-->


    <!-- 1) 객체 배열 반복문 -->
    <div> 
        <ul v-for ="user in users" :key ="user.id">
            <li>{{user.id}}</li>
            <li>{{user.name}}</li>
            <li>{{user.age}}</li>
        </ul>
    </div>
    <hr>
    <!-- 2) 객체 배열 반복문 -->
    <div>
        <ul v-for ="user in users" :key = "user.id">
            <li v-for ="(value, name , idx) in user" :key = "user.name">
            {{ name }} : {{value}} , {{idx}}
            </li>
        </ul>
    </div>



`;


export default {
    template,
    data(){
        return{
            myArray : ['김밥' , '샌드위치' , '햄버거' , '라면'],
            users : [
                {
                    id : 1,
                    name : 'hong',
                    age:20
                },
                {
                    id : 2,
                    name : 'kang',
                    age : 30
                },
                {
                    id : 3,
                    name : 'lee',
                    age : 25
                },
                {
                    id : 4,
                    name : 'chae',
                    age : 29
                }

            ]
        }
    }
}