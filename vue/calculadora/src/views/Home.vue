<template>
  <div>
    <v-container>
      <calculadora-basica />
      <hello-world />
      <v-row>
        <v-col>
          <v-btn color="primary" elevation="2" @click="paso1()">About</v-btn>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
// @ is an alias to /src
import CalculadoraBasica from "@/components/CalculadoraBasica.vue";
import HelloWorld from "../components/HelloWorld.vue";

export default {
  name: "Home",
  components: {
    CalculadoraBasica,
    HelloWorld,
  },
  methods: {
    paso1() {
      console.log("clic en botón About");
      this.$router.push("/about");
    },
  },
};
</script>
