/* 
* script.js
*/

//bubbling (false)-  defalut값이 flase임 . 제일 하위요소부터 찾아가기
//capturing (true)-제일 상위요소부터 찾아가기
//e.stopPropagation(); 이벤트를 계속 증가하는 것을 찾아겠습니다. 하 -> 상 이벤트전파 차단.
console.log("script.js");
console.log(document);
	
													//버튼에 click이벤트가 발생하면  clickFnc함수가 발생. => 핸들러
document.querySelector('button.btn').addEventListener('click', clickFnc); //querySelector = 선택자. button을 찾겠다.
function clickFnc(e){ //event를 e의 변수 매개값으로 받음.
	console.log(e);
	let userValue = document.querySelector('input#name').value; //input태그의 아디값을 기준으로 name이라는 아이디 그 값으로 선택하겠다.
	// alert(userValue);
	//id가 name이라는 값을 가지고 있는
	
	// 이름을 가지고 왔으니. li라는 요소를 만들겠습니다
	let liTag = document.createElement('li'); // createElement =>요소를 만드는 기능
								 // 'li' 라는 요소를 만들겠습니다
	
	
	liTag.innerText = userValue; // <li> 요소에 사용자가 입력하면 li요소와 텍스트를 만듦.
							     // <li> 홍길동 </li>
	
	document.querySelector('#list').append(liTag); // 아이디값이 list . //id = #으로 씀
							      //liTag를 하위요소에 붙이겠습니다.
	// init.
	document.querySelector('#name').value = ''; // name태그의 값을 비워두겠습니다.
	
	// li를 추가할 떄마다 옆에 삭제버튼이름이 뜨게 만들기.
	// 일단 공란으로 만들어줘야함.
	liTag.innerText = userValue + '';
	//삭제
	//button 생성.
	let btn= document.createElement('button');					     
	btn.innerText = '삭제';
	liTag.append(btn);
}

// 
document.querySelector('#addBtn').addEventListener('click', addRow);
function addRow(){
	let sno, sname, score;
	
	// sno = document.querySelector(`input.userValue:nth-of-type(1)`);
	// input 태그의 userValue 의 첫번째를 찾는것
	sno = document.querySelector('#sno').value;
	sname = document.querySelector('#sname').value;
	score = document.querySelector('#score').value;
	
	//document.querySelectorAll('table')
	// 모든 'table' 타입을 호출
	
	//document.querySelectorAll('table:nth-of-type(1) input')
	document.querySelectorAll('#stdTable input').forEach(function(item, idx, ary) {
		item.value ='';
	})
	
	//앞의 하위 input태그를 다 가지고 와서 forEach각각의 요소들에 대해서  //item => input 태그
															  //idx =>
															  //ary => 
	
	//let obj = {sno: sno, sname: sname, score: score}
				//속성과 값을 하나로 통일시켜 코드를 줄여줌.
	if (!sno || !sname || !score){ //값이 없으면 false
		alert('빈값을 채워주세요.');
		return; // return 구문을 만나면 함수를 종료함.
				// 값이 있으면 밑으로 내려감.
	} 
	let obj = {sno, sname, score}
	let td = makeRow(obj);
	document.querySelector('#studentList').appendChild(td);
	document.querySelector('#sno').value;
	document.querySelector('#sname').value;
	document.querySelector('#score').value;
}

//student 데이터 타입이 객체타입인데 
//첫번째는 sno , 두번쨰는 sname ...
function makeRow(student = {sno: 1, sname:'test', score:90}){
	let tr = document.createElement('tr');
	tr.addEventListener('click', displayRow);
	
	for (let prop in student){
		let td = document.createElement('td');
		td.innerText = student[prop];
		tr.appendChild(td);
	}
	// 삭제버튼 추가코드
	let btn = document.createElement('button');
	btn.addEventListener('click', deleteRow)// button에 이벤트달기
	
	btn.innerText ='삭제';
	
	let td = document.createElement('td');
	td.appendChild(btn);
	tr.appendChild(td);
	
	return tr;
}

//btn.addEventListener('click', deleteRow ) 클릭이라는 이벤트가 발생하면 
// 밑의 함수 실행
// 삭제기능
function deleteRow(e){
	console.log(e.target);
	e.target.parentElement.parentElement.remove();
		    // 부모요소안의 부모요소를 .remove() 화면에서 제외
}

// 상세보기 기능.
function displayRow(e){
	console.log(e.target, this);
	document.querySelector('#sno').value   = this.children[0].innerText;
	document.querySelector('#sname').value = this.children[1].innerText;
	document.querySelector('#score').value = this.children[2].innerText;
	
}

//수정기능
//	document.querySelector('#editBtn').addEventListener('click', editRow);
//function editRow(e){
//	let list = document.querySelectorAll('#tlist tbody tr')
//	for(let i=0; i<list.length; i++){
//		if(list[i].children[0].innertext == document.querySelector('#sno').value){
//			
//			list[i].children[2].innerText = document.querySelector('#score').value
//		}
//		
//	}
//}
//수정기능
document.querySelector('#editBtn').addEventListener('click', editRow);
function editRow(e){
	let list = document.querySelectorAll('#studentList tr')
	for(let std of list){
		if(std.children[0].innertext == document.querySelector('#sno').value){
			std.children[1].innerText = document.querySelector('#sname').value; 
									//value : input태그의 값을 정할 때쓰는 속성
			std.children[2].innerText = document.querySelector('#score').value;
		}
		
	}
}

//배열은   for of
//객체는   for in

// str에 값을  활용해서 화면출력하기.
function makeTr(){
	// tr생성.
	// td * 3 생성.
	// tr을  tbody.appendChild
	//str의 값을 student의 매개변수에 할당
	for (let student of str){
		// tr
	let addTr = document.createElement('tr'); //student의 값만큼 tr생성
		for (let prop in student){ // student 안의 값만큼 prop 을 선언한다.
			
			let addTd = document.createElement('td'); // student의 값을 받는 prop의 값만큼 td를 생성 
						//첫번쨰 반복 후 현시점 => <tr></tr> <td></td><td></td><td></td>
			
			addTd.innerText = student[prop];
						//addTd 안에 student[prop] 들어있는 값들을 차례대로 집어넣는다.
						//첫번쨰 반복 후 현시점 => <tr></tr> <td>101</td> <td>홍길동</td> <td>70</td>
			
			addTr.appendChild(addTd);
						// appendChild(addTd) => addTr 안에 자식요소로 addTd를 넣는다
						//첫번째 반복 후 현시점 => <tr> <td>101</td> <td>홍길동</td> <td>70</td> </tr>
		}
		//document.querySelector('tbody').appendChild(addTr);
		// or
		document.querySelector('#studentList').appendChild(addTr);
	}
makeTr();
}



// addEventListener
// 버튼이 여러개있으면 button.btn > 버튼이 클래스가 .btn이라는 요소를 찾겠다.