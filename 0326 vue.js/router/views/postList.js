//postList.js


let template = `
<div>
<table>
    <thead>
        <tr>
            <th>id</th>
            <th>title</th>
            <th>userId</th>
        </tr>
    </thead>
    <tbody>
        <template v-for="post in postList" :key="post.id">
        <tr v-if ="post.id <= 10" 
            @click="goToDetail(post.id)"> <!-- 이벤트 객체를 사용할 필요 없이 매개변수로 바로 넘길 수도 있음 -->
            <td>{{post.id}}</td>
            <td>{{post.title}}</td>
            <td>{{post.userId}}</td>
        </tr>
        </template>
    </tbody>
</table>
</div>
`;

export default {
    template,
    data() {
        return {
            postList: [] //전체조회
        }
    },
    created() {
        this.getPostList(); // create = 비동기호출
    },
    methods: {

        //getPostList(){
        /* fetch('')
         .then(res => res.json())
         .then(data =>{
         this.postList = data;
          })
         .catch(err => console.log(err))   */
        //}   
        async getPostList() { //비동기작업
            // 비동기 통신의 순서를 동기식으로 진행
            this.postList = await fetch('https://jsonplaceholder.typicode.com/posts') //await 를 쓰는 순간 비동기 => 동기
                .then(res => res.json()) //await을 쓰면 .then(data=> {}) 를 쓰지 않아도 됨
                // =>  :: return이 생략됨     { } 을 넣으면 return해야함
                .catch(err => console.log(err))
        },

        goToDetail(postId){
            this.$router.push({
                name : 'postInfo',  // 무엇을 불러올 것인지 지정
                query : {   // 전달하고자 하는 값을 어떤 방식으로 전달할건지 지정
                         id : postId
                } 
            }); //.$router을 써서 .push()로 전달하는데 {}로 전달(값).
        }
    }
}
