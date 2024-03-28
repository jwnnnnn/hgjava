//ref_child.js

let template = `
    <button type="button"
            @click="childClick()"
            ref="btn">click
    </button>
    <p> {{ msg }} </p>
    

`;

export default{
    template,
    data(){
        return{
            msg : '',
            
        }
    },
    //created() { } 에선 refs가 작동 x , 렌더링이 되어야하기 때문에.
    mounted(){ 
        this.$refs.btn.click();  //자신이 가지고 있는 표준 태그 안에
                                 // 표준태그 정보를 기반으로
                                 // 특정한 이벤트를 강제로 일으키거나, 정보를 가지고 옴
    },
    methods : {
        childClick(){
            console.log('click 이벤트가 발생 ');
        },
        childFun(){
            console.log('child method가 실행');
        }
    }

}