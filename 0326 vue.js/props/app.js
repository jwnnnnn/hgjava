import MyNameComponent from './components/myName.js';
import CheckComponent from './components/check.js'
import RefParentComponent from './components/ref_parent.js';
import SlotParentComponent from './components/slot_parent.js';

const { createApp } = Vue

let template=`
    <div>
    <!--<MyNameComponent/> --> 
    <!--<CheckComponent/>-->
    <!--<RefParentComponent/>-->
    <SlotParentComponent/>
    </div>
`;


createApp({
    template,
    components : {
        MyNameComponent,
        CheckComponent,
        RefParentComponent,
        SlotParentComponent
    }
})

.mount('#app')