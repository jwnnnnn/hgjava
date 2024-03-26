//app.js
// => Root Component 부모 클래스 객체의 코어,  객체의 충돌처리를 담당하기도 함
import  RawComponent from './raw.js'; //임포트를 써서 export 하는 것을  RawComponent 이름으로 받는 다는 뜻

const { createApp } = Vue

const template =  `
<div>
    <!-- 자식 컴포넌트 추가 -->
    <RawComponent/> 
</div>
`;
//뷰 컴포넌트 안에 원하는 곳에 집어넣으면 됨.
createApp ({
    template,
    components : { 
        RawComponent, // 정보를 등록한 것  | 정식명칭 : 'raw-component : RawComponent'
   //대소문자를 가리지 않음.
    }
})
.mount('#app');