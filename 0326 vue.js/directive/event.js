//event.js
let template=`
    <!-- 타입이 있는 태그는 타입을 명시해야함 -->
    <button type="button" v-on:click="upCounter() ,printMsg($event)"> Add 1 </button>
    <p> The counter is : {{counter}} </p>
    <hr>

    <input type="number" v-model ="num">
    <button type="button" v-on:click="increseCounter(num)"> Add {{num}} </button>
    <p> The counter is : {{sum}} </p>
    <hr>
    <!-- 이벤트는 비동기 방식 -->
    <!-- 버블링 자체를 그만두는건 stop 밖에 없음.   나머지는 자기자신에게만-->
    <form style="border : 1px solid black;"v-on:click="showAlert('form')">
        <div style="border : 1px solid red;"v-on:click.self="showAlert('div')"> <!--.self 버블링은 계속 가는데 div 입장에서 나한테서 발생한 것이 아님.(넘겨만 줌)-->
            <!-- .once = 한번은 동작되지만 그 뒤로는 동작안됨 -->
            <p style="border : 1px solid green;"v-on:click.once="showAlert('p')">
                <a v-on:click href="https://www.naver.com/" style="border : 1px solid gray;">네이버</a> <!-- .prevent.stop -->
            </p>
            click div tag
        </div>
    </form>
    <hr>
    <input type ="text" v-model="keyword" @keyup.enter="showAlert(keyword)">


`;
//필드



export default{
    template,
    data(){
        return{
            counter : 0,
            num : 0,
            sum : 0,
            keyword : '엔터'
        }
    },
    methods : {
        //upCounter : function(){} 
        // ==
        upCounter(data){
            console.log(data);
            //this.data.counter += 1; // 객체 내부를 들고옴. 직접 프로퍼티와 메소드를 찾아가는 것을 허용
            //메소드
            this.counter += 1;  
        },
        printMsg(event){
            console.log(event)
        },

        increseCounter(){
            this.sum += this.num;
        },
        showAlert(tag){
            alert('click ' + tag);
        },
     

        
    }
}