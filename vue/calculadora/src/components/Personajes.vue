<template>
  <div>
    <h1>Personajes</h1>
    <!-----Lista de personajes---->
    <!--
      <ul>
          <li v-for="item in personajes" :key="item.Name">
              {{item.Name}}
          </li>
      </ul>
      -->
    <!--Tabla de personajes-->
    <v-simple-table dark>
      <template v-slot:default>
        <thead>
          <tr>
            <th class="text-left">Avatar</th>
            <th class="text-left">Name</th>
            <th class="text-left">Planet</th>
            <th class="text-left">Specie</th>
            <th class="text-left">Status</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="item in personajes" :key="item.Name">
            <td>
              <v-avatar>
                <img
                  :src="item.PicUrl"
                  :alt="item.Name"
                />
              </v-avatar>
            </td>
            <td>{{ item.Name }}</td>
            <td>{{ item.Planet }}</td>
            <td>{{ item.Species }}</td>
            <td>{{ item.Status }}</td>
          </tr>
        </tbody>
      </template>
    </v-simple-table>
  </div>
</template>

<script>
import store from "../store/index.js";

export default {
  data: () => {
    return {};
  },
  methods: {},
  created: () => {
    //acceder a las acciones del store
    store.dispatch("getPersonajes");
  },
  computed: {
    personajes: () => {
      return store.state.personajes;
    },
  },
};
</script>

<style>
</style>
