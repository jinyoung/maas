<template>

    <v-card outlined>
        <v-card-title>
            CreateVoicePrompt
        </v-card-title>

        <v-card-text>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Message" v-model="value.message" :editMode="editMode"/>
            <String label="Language" v-model="value.language" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createVoicePrompt"
            >
                CreateVoicePrompt
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateVoicePromptCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reservationId = {};
            this.value.userId = '';
            this.value.message = '';
            this.value.language = '';
        },
        watch: {
        },
        methods: {
            createVoicePrompt() {
                this.$emit('createVoicePrompt', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

