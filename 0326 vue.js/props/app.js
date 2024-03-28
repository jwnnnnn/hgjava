import MyNameComponent from './components/myName.js';
import CheckComponent from './components/check.js'
import RefParentComponent from './components/ref_parent.js';

const { createApp } = Vue

let template=`
    <div>
    <!--<MyNameComponent/> --> 
    <!--<CheckComponent/>-->
    <RefParentComponent/>
    </div>
`;


createApp({
    template,
    components : {
        MyNameComponent,
        CheckComponent,
        RefParentComponent
    }
})

.mount('#app')