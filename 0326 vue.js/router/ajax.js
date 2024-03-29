// ajax.js
/* 
   라우팅(Routing)
   : 특정 엔드 포인트에 대한 클라이언트 요청에  - 클라이언트 입장에서 내가 가야하는 곳
     애플리케이션이 응답하는 방법을 결정하는 것
    
     특정 엔드 포인트 = 메소드(Method) + 경로(Path) 
     get = 검색,조회 || 등록,수정 get X
     post = body 가 있어야함

     rest   Restful Server  기본적으로 json
     = uri(자원) + method(기능) 
     = get(조회 body X), post(등록 body O), put(수정 body O), delete(삭제 body X) get,post 구분 없이 모든 기능가능
     

     단건조회 :: get + empInfo?employedId=100
     전체조회 :: get + empList
     등록  :: post + empInsert
     수정  :: put + empUpdate
     삭제  :: get + empDelete?employeeId=100

*/

//  https://jsonplaceholder.typicode.com/posts
//  전체조회
//  fetch
fetch('https://jsonplaceholder.typicode.com/posts/') // get 방식이라서 경로만 요청.

    .then(response => {  // 기본적으로 response 통채로 넘어옴
        // body
        console.log(response);
        return response.json();       // 데이터 파싱작업 // promise 엔 json()을 못씀
    })
    .then(data => { // 파싱한 json 형식으로 데이터를 들고옴.
        console.log(data);
    })
    .catch(err => console.log(err)); // fetch 마지막엔 반드시 catch 넣어줘야 에러가나면 알려줌.



// jquery
//$.ajax('https://jsonplaceholder.typicode.com/posts') //중간단계가 없음.
//.done(data => {
//    console.log(data);
//})
//.fail(err => console.log(err))

// =====================================//

//  전체조회
//  fetch
fetch('https://jsonplaceholder.typicode.com/posts/' + 1) // +1 = 한 건 path valiable
    .then(res => res.json())
    .then(data => {
        console.log(data);
    })
    .catch(err => console.log(err));

//등록 JSON : {}, []   둘 중 하나
let posts = {
    id: 101,
    title: 'Hello!!',
    body: 'Today is Friday!!!',
    userId: 1
};

fetch('https://jsonplaceholder.typicode.com/posts/', {
    method: 'post',  //json 기본적으로 post 타입.
    headers: {
        'Content-type': 'application/json'   //반드시 지정해야함
    },
    body: JSON.stringify(posts)
}) // 경로는 같아야됨 get 방식이 아니라 ,설정이 필요함
    .then(res => res.json())
    .then(data => {
        console.log(data);
    })
    .catch(err => console.log(err));

// 수정
fetch('https://jsonplaceholder.typicode.com/posts/' + 3, { // 수정되는 정보를 통채로 넘김
    method: 'put',  // 수정은 put 타입.
    headers: {
        'Content-type': 'application/json'   //반드시 지정해야함
    },
    body: JSON.stringify({
        title: 'Welcome', // 서버정보 : '바뀔 내용'
        userId: 20,
        body: 'Test!'

    })
}) // 경로는 같아야됨 get 방식이 아니라 ,설정이 필요함
    .then(res => res.json())
    .then(data => {
        console.log(data);
    })
    .catch(err => console.log(err));


// 삭제
fetch('https://jsonplaceholder.typicode.com/posts/' + 3, { // 수정되는 정보를 통채로 넘김
    method: 'delete'
})
    .then(res => res.json())
    .then(data => {
        console.log(data);
    })
    .catch(err => console.log(err));

