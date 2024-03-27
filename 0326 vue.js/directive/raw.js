let template = `
<div>
    <!-- text 속성 -->
    <p v-text = "'Hello ' + title + ((new Date()).getFullYear())"/>  
                <!-- 텍스트 디렉티브 : 한번에 열고 닫는 태그를 써야함 -->
                <!-- 문자열 결합 -->

    <p> Hello , {{title + 'Plus !!'}}! Today is ... </p> 
                <!-- 두개의 태그를 열어서 중간에 {{ }}을 써서 위치를 잡아서 써야함 -->
                <!-- 자바스크립트 형식으로 쓰일 경우에는 ''을 써야함 --> 
    


    <!-- postId는 변수-->
    <!-- bind 디렉티브 조건이 제한이 없음 vue가 관리하는 속성  연결되는 구조를 바꿀 수 있음 -->
    <p v-bind:d="postId"  
                 name="temp"
                 text="Testing" />
                <img v-bind:src="시그니쳐_로고_맨투맨_네이비" style="width : 300px; height: 300px;">
        <hr>
                <a v-bind:href="url">0326 Vue 노션 링크</a>

    <!-- bind 디렉티브 - style  -->
    <!-- 한가지 스타일 -->
    <p style="color : blue;"> 문자색 직접지정 </p>
    <p v-bind:style="{ color : myColor1 }"> vue 방식1 </p>              <!-- 여러개의 값을 개체형태로-->

    <!-- 두가지 스타일 따로따로-->
    <p style="color : blue; font-size : 200%;"> 두가지 속성을 직접 지정 </p>
    <p v-bind:style="{ color : myColor2, fontSize : myfont2 }"> vue 방식2 </p>

    <!-- 두가지이상 스타일 한번에-->
    <p v-bind:style="myStyle"> vue 방식3 </p>


    <!-- bind 디렉티브 - class -->
    <p class="emphasis" >단일 직접 강조 </p>
    <p v-bind:class="myClass"> Vue 단일 클래스 강조 </p>

    <p class="bg emphasis"> 직접 복수 클래스 적용 </p>
    <p v-bind:class="[bgClass , myClass]"> Vue 복수 클래스 적용</p>

    <p v-bind:class="{'text' : isSelected}"> class 적용여부 제어 </p>
                           <!-- isSelected 가 프로퍼티이고 단반향 불린타입 -->
</div>
`;

//component => 독립된 객체형태

export default {  // 실제로 가져야하는 객체 모습. 값을 끄집어 냄
    template,
    data(){       //데이터의 실제 값 crud 사용가능. 풀어쓰면 => data :function(){ }  :을 생략
        return {  // 반드시 return 구문 필요. 원하는 프로퍼티를 쓰면 됨
            title : 'Vue.js ', //
            postId: 'raw',
            시그니쳐_로고_맨투맨_네이비 : '시그니쳐 로고 맨투맨 네이비.jpg',
            url : 'https://www.notion.so/vue-03-26-3aaf23d3cc1b4663945edc8cadedf25c' ,//기본방식이 전부 문자열로 들어감
            myColor1 : 'red',

            myColor2 : 'gray',
            myfont2  : '300%',

            myStyle : {
                color : 'green',
                fontSize : '200%'
            },

            myClass : 'emphasis',
            bgClass : 'bg',
            isSelected : true
            
            
        }
    }
}