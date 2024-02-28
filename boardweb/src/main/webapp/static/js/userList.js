/**
 * userList.js
 */

console.log('userList.js');

let str = `[{"id":1,"first_name":"Luz","last_name":"MacClay","email":"lmacclay0@sakura.ne.jp","gender":"Female","salary":2360},
{"id":2,"first_name":"Kirby","last_name":"Assur","email":"kassur1@twitpic.com","gender":"Male","salary":2407},
{"id":3,"first_name":"Rivkah","last_name":"Constantinou","email":"rconstantinou2@china.com.cn","gender":"Female","salary":2136},
{"id":4,"first_name":"Brandise","last_name":"Matusovsky","email":"bmatusovsky3@google.ru","gender":"Female","salary":3024},
{"id":5,"first_name":"Patin","last_name":"Meindl","email":"pmeindl4@oaic.gov.au","gender":"Male","salary":4784},
{"id":6,"first_name":"Phillip","last_name":"Dooland","email":"pdooland5@fc2.com","gender":"Male","salary":3997},
{"id":7,"first_name":"Dominik","last_name":"Grogono","email":"dgrogono6@goo.gl","gender":"Male","salary":2055},
{"id":8,"first_name":"Kary","last_name":"Kick","email":"kkick7@zimbio.com","gender":"Female","salary":3640},
{"id":9,"first_name":"Raleigh","last_name":"Bredgeland","email":"rbredgeland8@ebay.com","gender":"Male","salary":2466},
{"id":10,"first_name":"Ambrosi","last_name":"Licciardiello","email":"alicciardiello9@alibaba.com","gender":"Male","salary":4673},
{"id":11,"first_name":"Carrissa","last_name":"Vanyashin","email":"cvanyashina@hud.gov","gender":"Female","salary":3037},
{"id":12,"first_name":"Christiane","last_name":"Redwin","email":"credwinb@storify.com","gender":"Female","salary":4930},
{"id":13,"first_name":"Stephannie","last_name":"Reddoch","email":"sreddochc@reuters.com","gender":"Female","salary":4657},
{"id":14,"first_name":"Bucky","last_name":"Abramski","email":"babramskid@berkeley.edu","gender":"Male","salary":4812},
{"id":15,"first_name":"Miner","last_name":"Jedrzejkiewicz","email":"mjedrzejkiewicze@4shared.com","gender":"Male","salary":2575}]`;

let json = JSON.parse(str); // 문자열 -> object로 변환.
console.log(json);
document.addEventListener('DOMContentLoaded', function(e) {
	//DOM 요소가 다 로딩이되면,,
	document.querySelector('#name').value = '홍길동';
	//.value = set메소드
	let title = json[0];
	let tr = document.createElement('tr')
	for (let prop in title) {
		let th = document.createElement('th');
		th.innerText = prop;
		tr.appendChild(th);
	}
	document.querySelector('#tableList thead').appendChild(tr);

 
	//tbody 영역.
	json.forEach(function(item, idx) {
		console.log(item, idx);
		if(item.gender == 'Female'){
		let tr = document.createElement('tr');
		tr.addEventListener('click', displayRow);
		for (let prop in item) {
			let td = document.createElement('td');
			td.innerText = item[prop];
			tr.appendChild(td);
		}
	document.querySelector('#tableList thead').appendChild(tr);
	} 
			document.querySelector('#Male') == '';
	
	});
});


