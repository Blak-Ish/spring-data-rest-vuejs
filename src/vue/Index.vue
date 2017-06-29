<template>
    <div id="app">
        <link href="/assets/bootstrap.css" rel="stylesheet" >
        <link href="/assets/jquery-ui.css" rel="stylesheet" >
        <div class="row" id="mainContainer">
            <div class="col-md-12" id="mainContent">
               {{msg}}
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'index',
        data () {
            return {
                msg: 'Welcome to Your Vue.js App'
            }
        }
    }
</script>

<style>

</style>
