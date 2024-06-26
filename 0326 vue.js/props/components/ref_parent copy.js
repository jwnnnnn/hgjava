//ref_parent.js
import ChildComponent from './ref_child.js';
let template=`
    <div>
        <ChildComponent ref="child" /> <!-- 태그처럼 써서 ref를 달아도 괜찮음
                                        ref를 쓰면 태그에 대한 전체 정보를 넘겨옴 -->
        <!-- ref=" " 변수역할 -->
        <button type="button"
                @click="changeChildData">
                Change Child Data   
        </button>
        <button type="button"
                @click="clickChildEvent">
                Child Click Event
        </button>

        <button type="button"
                @click="executeChildFun">
                Child method Excute
        </button>

        <p> {{ meg}} </p>
    </div>
`;

export default {
    template,
    data(){
        return{
            isMounted : false
        }
    },
    
    mounted(){ //동작을 미룸
        this.isMounted = true;
    },
    methods : {
        changeChildData(){
            //console.log(this.$refs);  // 부모 
            //console.log(this.$refs.child);
            this.$refs.child.msg = 'Data Update'; //refs 안에 child가 등록이 되어 있음
        },
        clickChildEvent(){ // ChildComponent가 가지고 있는 태그를 제어
            let childCom = this.$refs.child;
            let childBtn = childCom.$refs.btn; 
            childBtn.click();

            this.$refs.child.$refs.btn.click();
            
            
        },
        executeChildFun(){
            this.$refs.child.childFunc(); // 메소드에 대한 접근도 가능함.
        }
    },
    components:{
        ChildComponent
    },
    computed : {
        msg(){
            return this.$refs.child.msg; // 자식이 가지고 있는 프로퍼티를 연결하는 것
                                         // ref 속성은 마운티드에서 동작함. 
                                         // created 쪽에서 사용x mounted에서 사용가능
                                         // mounted를 안하면 ref가 동작x
        }
    },
}