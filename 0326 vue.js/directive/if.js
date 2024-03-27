// if.js

let template=`
<div>
    <label>
        <input type="checkbox" v-model="myVisible">
            표시
        <p v-show = "myVisible"> show 디렉티브</p> <!-- 일단 생성 -->
        <p v-if = "myVisible"> if 디렉티브 </p>   <!-- 조건에 만족할 경우만 생성-->
        <p v-else = "myVisible"> 체크박스가 OFF </p>
    </label>

    <label>
        등급 : <input type="text" v-model="score">
    </label>
        <p v-if="score >= 90" > A </p>
        <p v-else-if="score >= 80"> B </p>
        <p v-else-if="score >= 70"> C </p>
        <p v-else-if="score >= 60"> D </p>
        <p v-else-if="score >= 50"> E </p>
        <p v-else>F
        <template v-for = "dan in 9 " :key="dan">
        <div v-if = "dan%2 == 0">
            <p v-for ="num in 9 " :key ="num">
            {{dan}} X {{num}} = {{ dan * num }}   
            </p>
            </div>
        </template>
        </p>
</div>
    
`;

export default{
    template,
    data(){
        return{
            myVisible : false,
            score : 0,
        }
    }
}