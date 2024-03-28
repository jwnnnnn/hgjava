//app.js
// => Root Component 부모 클래스 객체의 코어,  객체의 충돌처리를 담당하기도 함
import  RawComponent from './raw.js'; //임포트를 써서 export 하는 것을  RawComponent 이름으로 받는 다는 뜻
import  InputComponent from './input.js';
import  Exam01Component from './exam01.js';
import  listComponent from './list.js'; 
import  Exam02Component from './exam02.js';
import  IfComponent from './if.js';
import  EventComponent from './event.js';
import  WatchComponent from './watch.js'
const { createApp } = Vue

const template =  `
<div>
    <!-- 자식 컴포넌트 추가 -->
    <!-- <RawComponent/> --> 
    <!-- <InputComponent/> -->
    <!--<Exam01Component /> -->
    <!--<listComponent /> -->
    <!--<Exam02Component> -->
    <!--<IfComponent>-->
    <!--<EventComponent>-->
    <WatchComponent>
</div>
`;
//뷰 컴포넌트 안에 원하는 곳에 집어넣으면 됨.
createApp ({
    template,
    components : { 
        RawComponent,
        InputComponent,
        Exam01Component,
        listComponent,
        Exam02Component,
        IfComponent,
        EventComponent,
        WatchComponent
        // 정보를 등록한 것  | 정식명칭 : 'raw-component : RawComponent'
        //대소문자를 가리지 않음.
    }
})
.mount('#app');