import axios from 'axios'

export const getHeroList = (params) =>{
    return axios({
        url:'',
        method:'get',
        param:params
    })
}
