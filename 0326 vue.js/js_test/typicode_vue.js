//typicode_vue.js
const { createApp } = Vue //createApp = 함수

//apend create 가 없어서 vue 가 해줌
let template =`
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
            <tr v-for="(post, idx) in postList" :key="idx" 
                v-on:click="getPostInfo(post.id)">
                <td>{{post.id}}</td>
                <td>{{post.title}}</td>
                <td>{{post.userId}}</td>
            </tr>
        </tbody>
    </table>
</div>
`;

//createApp 함수의 전체가 컴포넌트이자 뷰 (객체)
createApp({
  template, // 'template' : template // 객체 내부에 template을 집어넣음 (정보를 넘김) , 기본 골격을 먼저 작성하고 알려줘야함
  data() {
    return {
      postList : []
    }
  },
  created(){ // vue 인스턴스 루트 무조건 하나만 존재함
    this.getPostList();
  },
  methods : {  // methods = 동작 
               // vue 객체안의 기본형태.
    async getPostList(){
        this.postList = await fetch('https://jsonplaceholder.typicode.com/posts')
                              .then(res => res.json());
    },
    getPostInfo(id){
        fetch('https://jsonplaceholder.typicode.com/posts/'+id)
        .then(res => res.json())
        .then(data =>{
            console.log(data);
        });
    }
  }
}).mount('#list') //관리해야할 대상을 연결하는 것 