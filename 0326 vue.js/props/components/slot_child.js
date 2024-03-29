//slot_child.js
// 슬롯은 구조는 잡아줘야됨
// 이름은 지정하는게 좋음
// 슬롯에 name="" 속성 붙이기
// 생략하는 경우도 있지만 가능하면 여러개 슬롯을 사용할 경우 개별적으로 이름을 부여하는게 좋음
// 템플릿을 제외하고는 거의 사용하지 않음. (필요하다면 가능 = 프로퍼티를 슬롯에 연결하면 안됨.)
// 슬롯을 사용하는 경우 : 스타일을 컴포넌트 별로 적용가능
let template = `
    <div>
        <header>
            <slot name="title"></slot> <!-- 대상이 통채로 -->
        </header>

        <main>
            <slot name="content"></slot>
        </main>

        <footer>
            <slot></slot>
        </footer>
    </div>

 


`;

export default{
    template,
}