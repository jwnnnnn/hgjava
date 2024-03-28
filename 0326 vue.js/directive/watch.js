//watch.js
let template= `
    공급가액 : <input type="number" v-model="price" >원
    <p> 최종 소비자가 :  {{ taxIncluded }} </p>
    <p> 최종 소비자가 :  {{ getFinalPrice() }} </p>
    <p> 공급가액 50% 할인 : {{ taxIncluded * 0.5 }} </p>
    <p> 공급가액 50% 할인 : {{ getFinalPrice() * 0.5 }} </p>
    구입갯수 : <input type ="number" v-model.lazy="count"> 갯수
    <p > 결제금액 : {{ total }} 원 </p>
    <p> 부가세 : {{ tax }} 원 </p>
    <p> 매출액 : {{ revenue }} 원 </p>
    <hr>

    
   
    <p>금지문자는 [{{forbiddenText}}] </p>
    <textarea v-model="inputText"> < /textarea>
</div>



`;



export default{
    template,
    data(){
        return{
            price : 0,
            count : 0,  
            //forbiddenText: ['오늘','내일','비'],
            forbiddenText: '오늘',
            inputText : ''
        }
    },
    computed : { // 기본적으로 프로퍼티 => 매개변수X , return 필요 
                 // 반드시 프로퍼티 중에 하나를 사용해야함 => 내부에 반드시 프로퍼티가 포함되어야 함.
                 // 값을 가져야 할 때는 computed가 효율적 
                 // readonly 와 비슷함.
        taxIncluded(){
            return this.price *1.5;
        },
        total(){
            return this.taxIncluded * this.count;
        },
        tax(){
            return Math.round(this.total * 0.1 );
        },
        revenue(){
            return this.total - this.tax;
        }
    },
    
    methods : {  // 특정한 대상이 필요하면 메소드를 씀
        getFinalPrice(){
           return this.price * 1.1;
        }
    },
    
    watch : { //보통 메소드 밑에 사용 
              // 이름이 무조건 달라야함 , 이미 존재하는 프로퍼티 하나를 감시하는 역할 , 매개변수 x , return x
              // 처음엔 실행 X , 해당하는 것만 실행 ,하나하나 다 반응함. => lazy랑 같이 써야함
              // 프로퍼티가 변경될 경우 무슨 작업을 하겠다, 정의
              // 값 자체에 이벤트를 변화
              // 잘못 사용하면 무한루프
              count(){
                    
                alert('구입x')
            },
            inputText(){
                let pos = this.inputText.indexOf(this.forbiddenText)
                if(pos > -1){  // -1 이 아니면 위치상관없이 포함
                    alert(this.forbiddenText + '(은/는) 입력할 수 없습니다.')
                    this.inputText = this.inputText.substr(0, pos);
                }
                console.log(pos);
            }
     }
}
