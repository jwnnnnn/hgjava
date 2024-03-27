//exam02.js

let template= `
    <div>
    <p v-for ="line in 5" v-bind:key="line" > 
        <span v-for ="num in line" :key="num">
         {{'*'}}
        </span>
    </p>
    </div>

   
    
    <div>
        <div v-for = "num in 9 " :key ="num">
            <span v-for ="dan in 9 " :key ="dan">
            {{dan}} X {{num}} = {{ dan * num }}   
            </span>
            <br>
        </div>
    </div>


`;


export default {
    template,
    data(){
        return{
            star : ['*', '**','***','****','*****'],
            

        }
    }
}