import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    personajes: []
  },
  mutations: {
    setPersonajes(state, payload){
      state.personajes = payload;
    }
  },
  actions: {
    async getPersonajes({commit}){
      const peticion = await fetch('https://futuramaapi.herokuapp.com/api/v2/characters');
      const data = await peticion.json();
      console.log(data);
      commit('setPersonajes', data)
    }
  },
  modules: {
  }

})
