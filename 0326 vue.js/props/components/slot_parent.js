//slot_parent.js


import SlotChildComponent from './slot_child.js';

let template = `
<div><h1> 고정 데이터! </h1>
<!-- SlotParentComponent -->
<SlotChildComponent>
    <template v-slot:title>
        <h1> 팝업 타이틀 </h1>
    </template>
    
    
    <template v-slot:content>
        <p> 팝업 컨텐츠 1 </p>
        <p> 팝업 컨텐츠 2 </p>
    </template>
    
    <template v-slot:default>
        <button type="button"> 닫기 </button>
    </template>
</SlotChildComponent>


<SlotChildComponent>
<template v-slot:title>
    <h1> Info </h1>
</template>


<template v-slot:content>
    <p> Service </p>
    <input type="radio" v-model="select" value="A"> A 유형 <br>
    <input type="radio" v-model="select" value="B"> B 유형 <br><br><br> 
    
</template>

<template v-slot:default>
    <button type="button"> 완료 </button>
</template>
</SlotChildComponent>
</div>
`;


export default{
    template,
    data(){
      return{
        select : ''
      }  
    },
    components :{
        SlotChildComponent,
    }

}